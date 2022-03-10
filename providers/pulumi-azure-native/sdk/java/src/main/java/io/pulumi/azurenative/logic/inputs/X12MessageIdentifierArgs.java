// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 message identifier.
 * 
 */
public final class X12MessageIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12MessageIdentifierArgs Empty = new X12MessageIdentifierArgs();

    /**
     * The message id.
     * 
     */
    @InputImport(name="messageId", required=true)
      private final Input<String> messageId;

    public Input<String> getMessageId() {
        return this.messageId;
    }

    public X12MessageIdentifierArgs(Input<String> messageId) {
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
    }

    private X12MessageIdentifierArgs() {
        this.messageId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12MessageIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> messageId;

        public Builder() {
    	      // Empty
        }

        public Builder(X12MessageIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageId = defaults.messageId;
        }

        public Builder messageId(Input<String> messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder messageId(String messageId) {
            this.messageId = Input.of(Objects.requireNonNull(messageId));
            return this;
        }
        public X12MessageIdentifierArgs build() {
            return new X12MessageIdentifierArgs(messageId);
        }
    }
}
