// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigWindowsUpdateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigWindowsUpdateArgs Empty = new PatchDeploymentPatchConfigWindowsUpdateArgs();

    /**
     * Only apply updates of these windows update classifications. If empty, all updates are applied.
     * Each value may be one of `CRITICAL`, `SECURITY`, `DEFINITION`, `DRIVER`, `FEATURE_PACK`, `SERVICE_PACK`, `TOOL`, `UPDATE_ROLLUP`, and `UPDATE`.
     * 
     */
    @InputImport(name="classifications")
      private final @Nullable Input<List<String>> classifications;

    public Input<List<String>> getClassifications() {
        return this.classifications == null ? Input.empty() : this.classifications;
    }

    /**
     * List of KBs to exclude from update.
     * 
     */
    @InputImport(name="excludes")
      private final @Nullable Input<List<String>> excludes;

    public Input<List<String>> getExcludes() {
        return this.excludes == null ? Input.empty() : this.excludes;
    }

    /**
     * An exclusive list of kbs to be updated. These are the only patches that will be updated.
     * This field must not be used with other patch configurations.
     * 
     */
    @InputImport(name="exclusivePatches")
      private final @Nullable Input<List<String>> exclusivePatches;

    public Input<List<String>> getExclusivePatches() {
        return this.exclusivePatches == null ? Input.empty() : this.exclusivePatches;
    }

    public PatchDeploymentPatchConfigWindowsUpdateArgs(
        @Nullable Input<List<String>> classifications,
        @Nullable Input<List<String>> excludes,
        @Nullable Input<List<String>> exclusivePatches) {
        this.classifications = classifications;
        this.excludes = excludes;
        this.exclusivePatches = exclusivePatches;
    }

    private PatchDeploymentPatchConfigWindowsUpdateArgs() {
        this.classifications = Input.empty();
        this.excludes = Input.empty();
        this.exclusivePatches = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigWindowsUpdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> classifications;
        private @Nullable Input<List<String>> excludes;
        private @Nullable Input<List<String>> exclusivePatches;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigWindowsUpdateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classifications = defaults.classifications;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
        }

        public Builder classifications(@Nullable Input<List<String>> classifications) {
            this.classifications = classifications;
            return this;
        }

        public Builder classifications(@Nullable List<String> classifications) {
            this.classifications = Input.ofNullable(classifications);
            return this;
        }

        public Builder excludes(@Nullable Input<List<String>> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder excludes(@Nullable List<String> excludes) {
            this.excludes = Input.ofNullable(excludes);
            return this;
        }

        public Builder exclusivePatches(@Nullable Input<List<String>> exclusivePatches) {
            this.exclusivePatches = exclusivePatches;
            return this;
        }

        public Builder exclusivePatches(@Nullable List<String> exclusivePatches) {
            this.exclusivePatches = Input.ofNullable(exclusivePatches);
            return this;
        }
        public PatchDeploymentPatchConfigWindowsUpdateArgs build() {
            return new PatchDeploymentPatchConfigWindowsUpdateArgs(classifications, excludes, exclusivePatches);
        }
    }
}
