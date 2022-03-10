// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness.inputs;

import io.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceGetArgs;
import io.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceTargetResourceR53ResourceGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceSetResourceDnsTargetResourceTargetResourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSetResourceDnsTargetResourceTargetResourceGetArgs Empty = new ResourceSetResourceDnsTargetResourceTargetResourceGetArgs();

    /**
     * NLB resource a DNS Target Resource points to. Required if `r53_resource` is not set.
     * 
     */
    @InputImport(name="nlbResource")
      private final @Nullable Input<ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceGetArgs> nlbResource;

    public Input<ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceGetArgs> getNlbResource() {
        return this.nlbResource == null ? Input.empty() : this.nlbResource;
    }

    /**
     * Route53 resource a DNS Target Resource record points to.
     * 
     */
    @InputImport(name="r53Resource")
      private final @Nullable Input<ResourceSetResourceDnsTargetResourceTargetResourceR53ResourceGetArgs> r53Resource;

    public Input<ResourceSetResourceDnsTargetResourceTargetResourceR53ResourceGetArgs> getR53Resource() {
        return this.r53Resource == null ? Input.empty() : this.r53Resource;
    }

    public ResourceSetResourceDnsTargetResourceTargetResourceGetArgs(
        @Nullable Input<ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceGetArgs> nlbResource,
        @Nullable Input<ResourceSetResourceDnsTargetResourceTargetResourceR53ResourceGetArgs> r53Resource) {
        this.nlbResource = nlbResource;
        this.r53Resource = r53Resource;
    }

    private ResourceSetResourceDnsTargetResourceTargetResourceGetArgs() {
        this.nlbResource = Input.empty();
        this.r53Resource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetResourceDnsTargetResourceTargetResourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceGetArgs> nlbResource;
        private @Nullable Input<ResourceSetResourceDnsTargetResourceTargetResourceR53ResourceGetArgs> r53Resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetResourceDnsTargetResourceTargetResourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nlbResource = defaults.nlbResource;
    	      this.r53Resource = defaults.r53Resource;
        }

        public Builder nlbResource(@Nullable Input<ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceGetArgs> nlbResource) {
            this.nlbResource = nlbResource;
            return this;
        }

        public Builder nlbResource(@Nullable ResourceSetResourceDnsTargetResourceTargetResourceNlbResourceGetArgs nlbResource) {
            this.nlbResource = Input.ofNullable(nlbResource);
            return this;
        }

        public Builder r53Resource(@Nullable Input<ResourceSetResourceDnsTargetResourceTargetResourceR53ResourceGetArgs> r53Resource) {
            this.r53Resource = r53Resource;
            return this;
        }

        public Builder r53Resource(@Nullable ResourceSetResourceDnsTargetResourceTargetResourceR53ResourceGetArgs r53Resource) {
            this.r53Resource = Input.ofNullable(r53Resource);
            return this;
        }
        public ResourceSetResourceDnsTargetResourceTargetResourceGetArgs build() {
            return new ResourceSetResourceDnsTargetResourceTargetResourceGetArgs(nlbResource, r53Resource);
        }
    }
}
