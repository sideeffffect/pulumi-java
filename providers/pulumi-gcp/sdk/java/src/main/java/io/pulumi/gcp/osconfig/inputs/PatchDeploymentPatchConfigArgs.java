// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigAptArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigGooArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigWindowsUpdateArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigYumArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigZypperArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigArgs Empty = new PatchDeploymentPatchConfigArgs();

    /**
     * Apt update settings. Use this setting to override the default apt patch rules.
     * Structure is documented below.
     * 
     */
    @InputImport(name="apt")
      private final @Nullable Input<PatchDeploymentPatchConfigAptArgs> apt;

    public Input<PatchDeploymentPatchConfigAptArgs> getApt() {
        return this.apt == null ? Input.empty() : this.apt;
    }

    /**
     * goo update settings. Use this setting to override the default goo patch rules.
     * Structure is documented below.
     * 
     */
    @InputImport(name="goo")
      private final @Nullable Input<PatchDeploymentPatchConfigGooArgs> goo;

    public Input<PatchDeploymentPatchConfigGooArgs> getGoo() {
        return this.goo == null ? Input.empty() : this.goo;
    }

    /**
     * The ExecStep to run after the patch update.
     * Structure is documented below.
     * 
     */
    @InputImport(name="postStep")
      private final @Nullable Input<PatchDeploymentPatchConfigPostStepArgs> postStep;

    public Input<PatchDeploymentPatchConfigPostStepArgs> getPostStep() {
        return this.postStep == null ? Input.empty() : this.postStep;
    }

    /**
     * The ExecStep to run before the patch update.
     * Structure is documented below.
     * 
     */
    @InputImport(name="preStep")
      private final @Nullable Input<PatchDeploymentPatchConfigPreStepArgs> preStep;

    public Input<PatchDeploymentPatchConfigPreStepArgs> getPreStep() {
        return this.preStep == null ? Input.empty() : this.preStep;
    }

    /**
     * Post-patch reboot settings.
     * Possible values are `DEFAULT`, `ALWAYS`, and `NEVER`.
     * 
     */
    @InputImport(name="rebootConfig")
      private final @Nullable Input<String> rebootConfig;

    public Input<String> getRebootConfig() {
        return this.rebootConfig == null ? Input.empty() : this.rebootConfig;
    }

    /**
     * Windows update settings. Use this setting to override the default Windows patch rules.
     * Structure is documented below.
     * 
     */
    @InputImport(name="windowsUpdate")
      private final @Nullable Input<PatchDeploymentPatchConfigWindowsUpdateArgs> windowsUpdate;

    public Input<PatchDeploymentPatchConfigWindowsUpdateArgs> getWindowsUpdate() {
        return this.windowsUpdate == null ? Input.empty() : this.windowsUpdate;
    }

    /**
     * Yum update settings. Use this setting to override the default yum patch rules.
     * Structure is documented below.
     * 
     */
    @InputImport(name="yum")
      private final @Nullable Input<PatchDeploymentPatchConfigYumArgs> yum;

    public Input<PatchDeploymentPatchConfigYumArgs> getYum() {
        return this.yum == null ? Input.empty() : this.yum;
    }

    /**
     * zypper update settings. Use this setting to override the default zypper patch rules.
     * Structure is documented below.
     * 
     */
    @InputImport(name="zypper")
      private final @Nullable Input<PatchDeploymentPatchConfigZypperArgs> zypper;

    public Input<PatchDeploymentPatchConfigZypperArgs> getZypper() {
        return this.zypper == null ? Input.empty() : this.zypper;
    }

    public PatchDeploymentPatchConfigArgs(
        @Nullable Input<PatchDeploymentPatchConfigAptArgs> apt,
        @Nullable Input<PatchDeploymentPatchConfigGooArgs> goo,
        @Nullable Input<PatchDeploymentPatchConfigPostStepArgs> postStep,
        @Nullable Input<PatchDeploymentPatchConfigPreStepArgs> preStep,
        @Nullable Input<String> rebootConfig,
        @Nullable Input<PatchDeploymentPatchConfigWindowsUpdateArgs> windowsUpdate,
        @Nullable Input<PatchDeploymentPatchConfigYumArgs> yum,
        @Nullable Input<PatchDeploymentPatchConfigZypperArgs> zypper) {
        this.apt = apt;
        this.goo = goo;
        this.postStep = postStep;
        this.preStep = preStep;
        this.rebootConfig = rebootConfig;
        this.windowsUpdate = windowsUpdate;
        this.yum = yum;
        this.zypper = zypper;
    }

    private PatchDeploymentPatchConfigArgs() {
        this.apt = Input.empty();
        this.goo = Input.empty();
        this.postStep = Input.empty();
        this.preStep = Input.empty();
        this.rebootConfig = Input.empty();
        this.windowsUpdate = Input.empty();
        this.yum = Input.empty();
        this.zypper = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PatchDeploymentPatchConfigAptArgs> apt;
        private @Nullable Input<PatchDeploymentPatchConfigGooArgs> goo;
        private @Nullable Input<PatchDeploymentPatchConfigPostStepArgs> postStep;
        private @Nullable Input<PatchDeploymentPatchConfigPreStepArgs> preStep;
        private @Nullable Input<String> rebootConfig;
        private @Nullable Input<PatchDeploymentPatchConfigWindowsUpdateArgs> windowsUpdate;
        private @Nullable Input<PatchDeploymentPatchConfigYumArgs> yum;
        private @Nullable Input<PatchDeploymentPatchConfigZypperArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.postStep = defaults.postStep;
    	      this.preStep = defaults.preStep;
    	      this.rebootConfig = defaults.rebootConfig;
    	      this.windowsUpdate = defaults.windowsUpdate;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(@Nullable Input<PatchDeploymentPatchConfigAptArgs> apt) {
            this.apt = apt;
            return this;
        }

        public Builder apt(@Nullable PatchDeploymentPatchConfigAptArgs apt) {
            this.apt = Input.ofNullable(apt);
            return this;
        }

        public Builder goo(@Nullable Input<PatchDeploymentPatchConfigGooArgs> goo) {
            this.goo = goo;
            return this;
        }

        public Builder goo(@Nullable PatchDeploymentPatchConfigGooArgs goo) {
            this.goo = Input.ofNullable(goo);
            return this;
        }

        public Builder postStep(@Nullable Input<PatchDeploymentPatchConfigPostStepArgs> postStep) {
            this.postStep = postStep;
            return this;
        }

        public Builder postStep(@Nullable PatchDeploymentPatchConfigPostStepArgs postStep) {
            this.postStep = Input.ofNullable(postStep);
            return this;
        }

        public Builder preStep(@Nullable Input<PatchDeploymentPatchConfigPreStepArgs> preStep) {
            this.preStep = preStep;
            return this;
        }

        public Builder preStep(@Nullable PatchDeploymentPatchConfigPreStepArgs preStep) {
            this.preStep = Input.ofNullable(preStep);
            return this;
        }

        public Builder rebootConfig(@Nullable Input<String> rebootConfig) {
            this.rebootConfig = rebootConfig;
            return this;
        }

        public Builder rebootConfig(@Nullable String rebootConfig) {
            this.rebootConfig = Input.ofNullable(rebootConfig);
            return this;
        }

        public Builder windowsUpdate(@Nullable Input<PatchDeploymentPatchConfigWindowsUpdateArgs> windowsUpdate) {
            this.windowsUpdate = windowsUpdate;
            return this;
        }

        public Builder windowsUpdate(@Nullable PatchDeploymentPatchConfigWindowsUpdateArgs windowsUpdate) {
            this.windowsUpdate = Input.ofNullable(windowsUpdate);
            return this;
        }

        public Builder yum(@Nullable Input<PatchDeploymentPatchConfigYumArgs> yum) {
            this.yum = yum;
            return this;
        }

        public Builder yum(@Nullable PatchDeploymentPatchConfigYumArgs yum) {
            this.yum = Input.ofNullable(yum);
            return this;
        }

        public Builder zypper(@Nullable Input<PatchDeploymentPatchConfigZypperArgs> zypper) {
            this.zypper = zypper;
            return this;
        }

        public Builder zypper(@Nullable PatchDeploymentPatchConfigZypperArgs zypper) {
            this.zypper = Input.ofNullable(zypper);
            return this;
        }
        public PatchDeploymentPatchConfigArgs build() {
            return new PatchDeploymentPatchConfigArgs(apt, goo, postStep, preStep, rebootConfig, windowsUpdate, yum, zypper);
        }
    }
}
