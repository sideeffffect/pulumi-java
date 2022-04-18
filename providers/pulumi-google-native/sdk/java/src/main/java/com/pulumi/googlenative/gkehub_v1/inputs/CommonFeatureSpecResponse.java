// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkehub_v1.inputs.AppDevExperienceFeatureSpecResponse;
import com.pulumi.googlenative.gkehub_v1.inputs.MultiClusterIngressFeatureSpecResponse;
import java.util.Objects;


/**
 * CommonFeatureSpec contains Hub-wide configuration information
 * 
 */
public final class CommonFeatureSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final CommonFeatureSpecResponse Empty = new CommonFeatureSpecResponse();

    /**
     * Appdevexperience specific spec.
     * 
     */
    @Import(name="appdevexperience", required=true)
      private final AppDevExperienceFeatureSpecResponse appdevexperience;

    public AppDevExperienceFeatureSpecResponse appdevexperience() {
        return this.appdevexperience;
    }

    /**
     * Multicluster Ingress-specific spec.
     * 
     */
    @Import(name="multiclusteringress", required=true)
      private final MultiClusterIngressFeatureSpecResponse multiclusteringress;

    public MultiClusterIngressFeatureSpecResponse multiclusteringress() {
        return this.multiclusteringress;
    }

    public CommonFeatureSpecResponse(
        AppDevExperienceFeatureSpecResponse appdevexperience,
        MultiClusterIngressFeatureSpecResponse multiclusteringress) {
        this.appdevexperience = Objects.requireNonNull(appdevexperience, "expected parameter 'appdevexperience' to be non-null");
        this.multiclusteringress = Objects.requireNonNull(multiclusteringress, "expected parameter 'multiclusteringress' to be non-null");
    }

    private CommonFeatureSpecResponse() {
        this.appdevexperience = null;
        this.multiclusteringress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonFeatureSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppDevExperienceFeatureSpecResponse appdevexperience;
        private MultiClusterIngressFeatureSpecResponse multiclusteringress;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonFeatureSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appdevexperience = defaults.appdevexperience;
    	      this.multiclusteringress = defaults.multiclusteringress;
        }

        public Builder appdevexperience(AppDevExperienceFeatureSpecResponse appdevexperience) {
            this.appdevexperience = Objects.requireNonNull(appdevexperience);
            return this;
        }
        public Builder multiclusteringress(MultiClusterIngressFeatureSpecResponse multiclusteringress) {
            this.multiclusteringress = Objects.requireNonNull(multiclusteringress);
            return this;
        }        public CommonFeatureSpecResponse build() {
            return new CommonFeatureSpecResponse(appdevexperience, multiclusteringress);
        }
    }
}
