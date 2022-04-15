// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class IntentFulfillmentActivityCodeHookGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntentFulfillmentActivityCodeHookGetArgs Empty = new IntentFulfillmentActivityCodeHookGetArgs();

    /**
     * The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
     */
    @Import(name="messageVersion", required=true)
      private final Output<String> messageVersion;

    public Output<String> messageVersion() {
        return this.messageVersion;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    public IntentFulfillmentActivityCodeHookGetArgs(
        Output<String> messageVersion,
        Output<String> uri) {
        this.messageVersion = Objects.requireNonNull(messageVersion, "expected parameter 'messageVersion' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private IntentFulfillmentActivityCodeHookGetArgs() {
        this.messageVersion = Codegen.empty();
        this.uri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFulfillmentActivityCodeHookGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> messageVersion;
        private Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFulfillmentActivityCodeHookGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageVersion = defaults.messageVersion;
    	      this.uri = defaults.uri;
        }

        public Builder messageVersion(Output<String> messageVersion) {
            this.messageVersion = Objects.requireNonNull(messageVersion);
            return this;
        }
        public Builder messageVersion(String messageVersion) {
            this.messageVersion = Output.of(Objects.requireNonNull(messageVersion));
            return this;
        }
        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }        public IntentFulfillmentActivityCodeHookGetArgs build() {
            return new IntentFulfillmentActivityCodeHookGetArgs(messageVersion, uri);
        }
    }
}
