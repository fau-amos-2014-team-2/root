//
//  SettingsBundle.m
//  Wound Management
//
//  Created by Ruben Larisch on 02.07.14.
//
//

#import "SettingsBundle.h"

@implementation SettingsBundle

- (void)getSetting:(CDVInvokedUrlCommand *)command
{
    CDVPluginResult *pluginResult = nil;
    NSString *preferenceIdentifier = [command.arguments objectAtIndex:0];
    
    if (preferenceIdentifier != nil && [preferenceIdentifier length] > 0 && [[NSUserDefaults standardUserDefaults] objectForKey:preferenceIdentifier] != nil) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:[[NSUserDefaults standardUserDefaults] stringForKey:preferenceIdentifier]];
    }
    else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }
    
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void)getTargetUrl:(CDVInvokedUrlCommand *)command
{
    CDVPluginResult *pluginResult = nil;
    
    NSUserDefaults *standardUserDefaults = [NSUserDefaults standardUserDefaults];
    NSString *host = [standardUserDefaults stringForKey:@"host_preference"];
    NSString *port = [standardUserDefaults stringForKey:@"port_preference"];
    NSString *protocol = [standardUserDefaults stringForKey:@"protocol_preference"];
    NSString *path = [standardUserDefaults stringForKey:@"path_preference"];
    
    // Since the SettingsBundle returns nil if containing the default values, fill with the defaults values if nil
    
    if (port == nil)
        port = @"8080";
    
    if (protocol == nil)
        protocol = @"http";
    
    if (path == nil)
        path = @"";
    
    if ([path length] > 0 && [path characterAtIndex:0] == '/')
        path = [path substringFromIndex:1];
    
    if (host != nil && port != nil && protocol != nil) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:[NSString stringWithFormat:@"%@://%@:%@/%@", protocol, host, port, path]];
    }
    else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }
    
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
