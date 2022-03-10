// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Distcp settings.
 * 
 */
public final class DistcpSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistcpSettingsArgs Empty = new DistcpSettingsArgs();

    /**
     * Specifies the Distcp options. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="distcpOptions")
      private final @Nullable Input<Object> distcpOptions;

    public Input<Object> getDistcpOptions() {
        return this.distcpOptions == null ? Input.empty() : this.distcpOptions;
    }

    /**
     * Specifies the Yarn ResourceManager endpoint. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="resourceManagerEndpoint", required=true)
      private final Input<Object> resourceManagerEndpoint;

    public Input<Object> getResourceManagerEndpoint() {
        return this.resourceManagerEndpoint;
    }

    /**
     * Specifies an existing folder path which will be used to store temp Distcp command script. The script file is generated by ADF and will be removed after Copy job finished. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tempScriptPath", required=true)
      private final Input<Object> tempScriptPath;

    public Input<Object> getTempScriptPath() {
        return this.tempScriptPath;
    }

    public DistcpSettingsArgs(
        @Nullable Input<Object> distcpOptions,
        Input<Object> resourceManagerEndpoint,
        Input<Object> tempScriptPath) {
        this.distcpOptions = distcpOptions;
        this.resourceManagerEndpoint = Objects.requireNonNull(resourceManagerEndpoint, "expected parameter 'resourceManagerEndpoint' to be non-null");
        this.tempScriptPath = Objects.requireNonNull(tempScriptPath, "expected parameter 'tempScriptPath' to be non-null");
    }

    private DistcpSettingsArgs() {
        this.distcpOptions = Input.empty();
        this.resourceManagerEndpoint = Input.empty();
        this.tempScriptPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistcpSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> distcpOptions;
        private Input<Object> resourceManagerEndpoint;
        private Input<Object> tempScriptPath;

        public Builder() {
    	      // Empty
        }

        public Builder(DistcpSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distcpOptions = defaults.distcpOptions;
    	      this.resourceManagerEndpoint = defaults.resourceManagerEndpoint;
    	      this.tempScriptPath = defaults.tempScriptPath;
        }

        public Builder distcpOptions(@Nullable Input<Object> distcpOptions) {
            this.distcpOptions = distcpOptions;
            return this;
        }

        public Builder distcpOptions(@Nullable Object distcpOptions) {
            this.distcpOptions = Input.ofNullable(distcpOptions);
            return this;
        }

        public Builder resourceManagerEndpoint(Input<Object> resourceManagerEndpoint) {
            this.resourceManagerEndpoint = Objects.requireNonNull(resourceManagerEndpoint);
            return this;
        }

        public Builder resourceManagerEndpoint(Object resourceManagerEndpoint) {
            this.resourceManagerEndpoint = Input.of(Objects.requireNonNull(resourceManagerEndpoint));
            return this;
        }

        public Builder tempScriptPath(Input<Object> tempScriptPath) {
            this.tempScriptPath = Objects.requireNonNull(tempScriptPath);
            return this;
        }

        public Builder tempScriptPath(Object tempScriptPath) {
            this.tempScriptPath = Input.of(Objects.requireNonNull(tempScriptPath));
            return this;
        }
        public DistcpSettingsArgs build() {
            return new DistcpSettingsArgs(distcpOptions, resourceManagerEndpoint, tempScriptPath);
        }
    }
}
