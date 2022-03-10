// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 message filter for odata query.
 * 
 */
public final class X12MessageFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final X12MessageFilterResponse Empty = new X12MessageFilterResponse();

    /**
     * The message filter type.
     * 
     */
    @InputImport(name="messageFilterType", required=true)
      private final String messageFilterType;

    public String getMessageFilterType() {
        return this.messageFilterType;
    }

    public X12MessageFilterResponse(String messageFilterType) {
        this.messageFilterType = Objects.requireNonNull(messageFilterType, "expected parameter 'messageFilterType' to be non-null");
    }

    private X12MessageFilterResponse() {
        this.messageFilterType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12MessageFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageFilterType;

        public Builder() {
    	      // Empty
        }

        public Builder(X12MessageFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFilterType = defaults.messageFilterType;
        }

        public Builder messageFilterType(String messageFilterType) {
            this.messageFilterType = Objects.requireNonNull(messageFilterType);
            return this;
        }
        public X12MessageFilterResponse build() {
            return new X12MessageFilterResponse(messageFilterType);
        }
    }
}
