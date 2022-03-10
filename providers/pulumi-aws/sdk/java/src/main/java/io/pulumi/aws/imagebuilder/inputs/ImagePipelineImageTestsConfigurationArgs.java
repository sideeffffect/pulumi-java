// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImagePipelineImageTestsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImagePipelineImageTestsConfigurationArgs Empty = new ImagePipelineImageTestsConfigurationArgs();

    /**
     * Whether image tests are enabled. Defaults to `true`.
     * 
     */
    @InputImport(name="imageTestsEnabled")
      private final @Nullable Input<Boolean> imageTestsEnabled;

    public Input<Boolean> getImageTestsEnabled() {
        return this.imageTestsEnabled == null ? Input.empty() : this.imageTestsEnabled;
    }

    /**
     * Number of minutes before image tests time out. Valid values are between `60` and `1440`. Defaults to `720`.
     * 
     */
    @InputImport(name="timeoutMinutes")
      private final @Nullable Input<Integer> timeoutMinutes;

    public Input<Integer> getTimeoutMinutes() {
        return this.timeoutMinutes == null ? Input.empty() : this.timeoutMinutes;
    }

    public ImagePipelineImageTestsConfigurationArgs(
        @Nullable Input<Boolean> imageTestsEnabled,
        @Nullable Input<Integer> timeoutMinutes) {
        this.imageTestsEnabled = imageTestsEnabled;
        this.timeoutMinutes = timeoutMinutes;
    }

    private ImagePipelineImageTestsConfigurationArgs() {
        this.imageTestsEnabled = Input.empty();
        this.timeoutMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineImageTestsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> imageTestsEnabled;
        private @Nullable Input<Integer> timeoutMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineImageTestsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageTestsEnabled = defaults.imageTestsEnabled;
    	      this.timeoutMinutes = defaults.timeoutMinutes;
        }

        public Builder imageTestsEnabled(@Nullable Input<Boolean> imageTestsEnabled) {
            this.imageTestsEnabled = imageTestsEnabled;
            return this;
        }

        public Builder imageTestsEnabled(@Nullable Boolean imageTestsEnabled) {
            this.imageTestsEnabled = Input.ofNullable(imageTestsEnabled);
            return this;
        }

        public Builder timeoutMinutes(@Nullable Input<Integer> timeoutMinutes) {
            this.timeoutMinutes = timeoutMinutes;
            return this;
        }

        public Builder timeoutMinutes(@Nullable Integer timeoutMinutes) {
            this.timeoutMinutes = Input.ofNullable(timeoutMinutes);
            return this;
        }
        public ImagePipelineImageTestsConfigurationArgs build() {
            return new ImagePipelineImageTestsConfigurationArgs(imageTestsEnabled, timeoutMinutes);
        }
    }
}
