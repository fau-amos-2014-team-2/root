//
//  SettingsBundle.h
//  Wound Management
//
//  Created by Ruben Larisch on 02.07.14.
//
//

#import <Cordova/CDVPlugin.h>

@interface SettingsBundle : CDVPlugin

- (void)getSetting:(CDVInvokedUrlCommand*)command;
- (void)getTargetUrl:(CDVInvokedUrlCommand*)command;

@end
