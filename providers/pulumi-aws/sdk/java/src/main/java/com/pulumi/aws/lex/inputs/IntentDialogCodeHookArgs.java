// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IntentDialogCodeHookArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentDialogCodeHookArgs Empty = new IntentDialogCodeHookArgs();

    /**
     * The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
     */
    @Import(name="messageVersion", required=true)
    private Output<String> messageVersion;

    public Output<String> messageVersion() {
        return this.messageVersion;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    private IntentDialogCodeHookArgs() {}

    private IntentDialogCodeHookArgs(IntentDialogCodeHookArgs $) {
        this.messageVersion = $.messageVersion;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentDialogCodeHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentDialogCodeHookArgs $;

        public Builder() {
            $ = new IntentDialogCodeHookArgs();
        }

        public Builder(IntentDialogCodeHookArgs defaults) {
            $ = new IntentDialogCodeHookArgs(Objects.requireNonNull(defaults));
        }

        public Builder messageVersion(Output<String> messageVersion) {
            $.messageVersion = messageVersion;
            return this;
        }

        public Builder messageVersion(String messageVersion) {
            return messageVersion(Output.of(messageVersion));
        }

        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public IntentDialogCodeHookArgs build() {
            $.messageVersion = Objects.requireNonNull($.messageVersion, "expected parameter 'messageVersion' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
