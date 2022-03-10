// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.PreflightOption;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs Empty = new ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs();

    @InputImport(name="preflightOptions")
      private final @Nullable Input<List<Either<String,PreflightOption>>> preflightOptions;

    public Input<List<Either<String,PreflightOption>>> getPreflightOptions() {
        return this.preflightOptions == null ? Input.empty() : this.preflightOptions;
    }

    @InputImport(name="preflightSupported")
      private final @Nullable Input<Boolean> preflightSupported;

    public Input<Boolean> getPreflightSupported() {
        return this.preflightSupported == null ? Input.empty() : this.preflightSupported;
    }

    public ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs(
        @Nullable Input<List<Either<String,PreflightOption>>> preflightOptions,
        @Nullable Input<Boolean> preflightSupported) {
        this.preflightOptions = preflightOptions;
        this.preflightSupported = preflightSupported;
    }

    private ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs() {
        this.preflightOptions = Input.empty();
        this.preflightSupported = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Either<String,PreflightOption>>> preflightOptions;
        private @Nullable Input<Boolean> preflightSupported;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preflightOptions = defaults.preflightOptions;
    	      this.preflightSupported = defaults.preflightSupported;
        }

        public Builder preflightOptions(@Nullable Input<List<Either<String,PreflightOption>>> preflightOptions) {
            this.preflightOptions = preflightOptions;
            return this;
        }

        public Builder preflightOptions(@Nullable List<Either<String,PreflightOption>> preflightOptions) {
            this.preflightOptions = Input.ofNullable(preflightOptions);
            return this;
        }

        public Builder preflightSupported(@Nullable Input<Boolean> preflightSupported) {
            this.preflightSupported = preflightSupported;
            return this;
        }

        public Builder preflightSupported(@Nullable Boolean preflightSupported) {
            this.preflightSupported = Input.ofNullable(preflightSupported);
            return this;
        }
        public ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs build() {
            return new ResourceProviderManifestPropertiesTemplateDeploymentOptionsArgs(preflightOptions, preflightSupported);
        }
    }
}
