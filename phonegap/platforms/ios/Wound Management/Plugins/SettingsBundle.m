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
    
    if (host != nil && port != nil && protocol != nil) {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:[NSString stringWithFormat:@"%@://%@:%@", protocol, host, port]];
    }
    else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }
    
    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
