#import "JustpayPlugin.h"
#if __has_include(<justpayPlugin/justpayPlugin-Swift.h>)
#import <justpayPlugin/justpayPlugin-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "justpayPlugin-Swift.h"
#endif

@implementation JustpayPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftJustpayPlugin registerWithRegistrar:registrar];
}
@end
