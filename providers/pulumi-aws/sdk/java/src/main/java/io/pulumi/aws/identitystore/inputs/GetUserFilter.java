// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.identitystore.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserFilter extends io.pulumi.resources.InvokeArgs {

    public static final GetUserFilter Empty = new GetUserFilter();

    /**
     * The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
     * 
     */
    @InputImport(name="attributePath", required=true)
      private final String attributePath;

    public String getAttributePath() {
        return this.attributePath;
    }

    /**
     * The value for an attribute.
     * 
     */
    @InputImport(name="attributeValue", required=true)
      private final String attributeValue;

    public String getAttributeValue() {
        return this.attributeValue;
    }

    public GetUserFilter(
        String attributePath,
        String attributeValue) {
        this.attributePath = Objects.requireNonNull(attributePath, "expected parameter 'attributePath' to be non-null");
        this.attributeValue = Objects.requireNonNull(attributeValue, "expected parameter 'attributeValue' to be non-null");
    }

    private GetUserFilter() {
        this.attributePath = null;
        this.attributeValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributePath;
        private String attributeValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributePath = defaults.attributePath;
    	      this.attributeValue = defaults.attributeValue;
        }

        public Builder attributePath(String attributePath) {
            this.attributePath = Objects.requireNonNull(attributePath);
            return this;
        }

        public Builder attributeValue(String attributeValue) {
            this.attributeValue = Objects.requireNonNull(attributeValue);
            return this;
        }
        public GetUserFilter build() {
            return new GetUserFilter(attributePath, attributeValue);
        }
    }
}
