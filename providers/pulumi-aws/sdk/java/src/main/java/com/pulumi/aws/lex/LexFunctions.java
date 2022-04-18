// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lex.inputs.GetBotAliasArgs;
import com.pulumi.aws.lex.inputs.GetBotArgs;
import com.pulumi.aws.lex.inputs.GetIntentArgs;
import com.pulumi.aws.lex.inputs.GetSlotTypeArgs;
import com.pulumi.aws.lex.outputs.GetBotAliasResult;
import com.pulumi.aws.lex.outputs.GetBotResult;
import com.pulumi.aws.lex.outputs.GetIntentResult;
import com.pulumi.aws.lex.outputs.GetSlotTypeResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class LexFunctions {
    /**
     * Provides details about a specific Amazon Lex Bot.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBotResult> getBot(GetBotArgs args) {
        return getBot(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBotResult> getBot(GetBotArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lex/getBot:getBot", TypeShape.of(GetBotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific Amazon Lex Bot Alias.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBotAliasResult> getBotAlias(GetBotAliasArgs args) {
        return getBotAlias(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBotAliasResult> getBotAlias(GetBotAliasArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lex/getBotAlias:getBotAlias", TypeShape.of(GetBotAliasResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific Amazon Lex Intent.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetIntentResult> getIntent(GetIntentArgs args) {
        return getIntent(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIntentResult> getIntent(GetIntentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lex/getIntent:getIntent", TypeShape.of(GetIntentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific Amazon Lex Slot Type.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSlotTypeResult> getSlotType(GetSlotTypeArgs args) {
        return getSlotType(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSlotTypeResult> getSlotType(GetSlotTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lex/getSlotType:getSlotType", TypeShape.of(GetSlotTypeResult.class), args, Utilities.withVersion(options));
    }
}
