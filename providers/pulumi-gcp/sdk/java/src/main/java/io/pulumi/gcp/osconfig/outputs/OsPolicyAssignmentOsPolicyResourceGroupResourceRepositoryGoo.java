// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo {
    /**
     * Required. The name of the repository.
     * 
     */
    private final String name;
    /**
     * Required. The url of the repository.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("url") String url) {
        this.name = name;
        this.url = url;
    }

    /**
     * Required. The name of the repository.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Required. The url of the repository.
     * 
    */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo(name, url);
        }
    }
}
