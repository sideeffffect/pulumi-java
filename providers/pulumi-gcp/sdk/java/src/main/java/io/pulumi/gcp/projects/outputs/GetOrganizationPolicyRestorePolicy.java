// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationPolicyRestorePolicy {
    private final Boolean $default;

    @OutputCustomType.Constructor({"$default"})
    private GetOrganizationPolicyRestorePolicy(Boolean $default) {
        this.$default = $default;
    }

    public Boolean get$default() {
        return this.$default;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyRestorePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean $default;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyRestorePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
        }

        public Builder set$default(Boolean $default) {
            this.$default = Objects.requireNonNull($default);
            return this;
        }
        public GetOrganizationPolicyRestorePolicy build() {
            return new GetOrganizationPolicyRestorePolicy($default);
        }
    }
}
