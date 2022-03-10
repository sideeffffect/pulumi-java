// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class PolicyStatusProperties {
    /**
     * Specifies whether the policy is public or not.
     * 
     */
    private final MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic isPublic;

    @OutputCustomType.Constructor
    private PolicyStatusProperties(@OutputCustomType.Parameter("isPublic") MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * Specifies whether the policy is public or not.
     * 
    */
    public MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic getIsPublic() {
        return this.isPublic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyStatusProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic isPublic;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyStatusProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPublic = defaults.isPublic;
        }

        public Builder isPublic(MultiRegionAccessPointPolicyPolicyStatusPropertiesIsPublic isPublic) {
            this.isPublic = Objects.requireNonNull(isPublic);
            return this;
        }
        public PolicyStatusProperties build() {
            return new PolicyStatusProperties(isPublic);
        }
    }
}
