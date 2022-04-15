// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.outputs;

import io.pulumi.aws.lex.outputs.IntentFulfillmentActivityCodeHook;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntentFulfillmentActivity {
    /**
     * A description of the Lambda function that is run to fulfill the intent.
     * Required if type is CodeHook. Attributes are documented under code_hook.
     * 
     */
    private final @Nullable IntentFulfillmentActivityCodeHook codeHook;
    /**
     * How the intent should be fulfilled, either by running a Lambda function or by
     * returning the slot data to the client application.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private IntentFulfillmentActivity(
        @CustomType.Parameter("codeHook") @Nullable IntentFulfillmentActivityCodeHook codeHook,
        @CustomType.Parameter("type") String type) {
        this.codeHook = codeHook;
        this.type = type;
    }

    /**
     * A description of the Lambda function that is run to fulfill the intent.
     * Required if type is CodeHook. Attributes are documented under code_hook.
     * 
    */
    public Optional<IntentFulfillmentActivityCodeHook> codeHook() {
        return Optional.ofNullable(this.codeHook);
    }
    /**
     * How the intent should be fulfilled, either by running a Lambda function or by
     * returning the slot data to the client application.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFulfillmentActivity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntentFulfillmentActivityCodeHook codeHook;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFulfillmentActivity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeHook = defaults.codeHook;
    	      this.type = defaults.type;
        }

        public Builder codeHook(@Nullable IntentFulfillmentActivityCodeHook codeHook) {
            this.codeHook = codeHook;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public IntentFulfillmentActivity build() {
            return new IntentFulfillmentActivity(codeHook, type);
        }
    }
}
