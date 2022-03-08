// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel {
    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    private final String name;
    /**
     * The value of the label must match the specified value. value can have a maximum
     * length of 1024 characters.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"name","value"})
    private URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel(
        String name,
        String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The value of the label must match the specified value. value can have a maximum
     * length of 1024 characters.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel build() {
            return new URLMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabel(name, value);
        }
    }
}
