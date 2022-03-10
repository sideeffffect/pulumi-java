// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Executes an artifact or local file.
 * 
 */
public final class SoftwareRecipeStepExecFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeStepExecFileArgs Empty = new SoftwareRecipeStepExecFileArgs();

    /**
     * Defaults to [0]. A list of possible return values that the program can return to indicate a success.
     * 
     */
    @InputImport(name="allowedExitCodes")
      private final @Nullable Input<List<Integer>> allowedExitCodes;

    public Input<List<Integer>> getAllowedExitCodes() {
        return this.allowedExitCodes == null ? Input.empty() : this.allowedExitCodes;
    }

    /**
     * Arguments to be passed to the provided executable.
     * 
     */
    @InputImport(name="args")
      private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @InputImport(name="artifactId")
      private final @Nullable Input<String> artifactId;

    public Input<String> getArtifactId() {
        return this.artifactId == null ? Input.empty() : this.artifactId;
    }

    /**
     * The absolute path of the file on the local filesystem.
     * 
     */
    @InputImport(name="localPath")
      private final @Nullable Input<String> localPath;

    public Input<String> getLocalPath() {
        return this.localPath == null ? Input.empty() : this.localPath;
    }

    public SoftwareRecipeStepExecFileArgs(
        @Nullable Input<List<Integer>> allowedExitCodes,
        @Nullable Input<List<String>> args,
        @Nullable Input<String> artifactId,
        @Nullable Input<String> localPath) {
        this.allowedExitCodes = allowedExitCodes;
        this.args = args;
        this.artifactId = artifactId;
        this.localPath = localPath;
    }

    private SoftwareRecipeStepExecFileArgs() {
        this.allowedExitCodes = Input.empty();
        this.args = Input.empty();
        this.artifactId = Input.empty();
        this.localPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepExecFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Integer>> allowedExitCodes;
        private @Nullable Input<List<String>> args;
        private @Nullable Input<String> artifactId;
        private @Nullable Input<String> localPath;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepExecFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.args = defaults.args;
    	      this.artifactId = defaults.artifactId;
    	      this.localPath = defaults.localPath;
        }

        public Builder allowedExitCodes(@Nullable Input<List<Integer>> allowedExitCodes) {
            this.allowedExitCodes = allowedExitCodes;
            return this;
        }

        public Builder allowedExitCodes(@Nullable List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Input.ofNullable(allowedExitCodes);
            return this;
        }

        public Builder args(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder artifactId(@Nullable Input<String> artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        public Builder artifactId(@Nullable String artifactId) {
            this.artifactId = Input.ofNullable(artifactId);
            return this;
        }

        public Builder localPath(@Nullable Input<String> localPath) {
            this.localPath = localPath;
            return this;
        }

        public Builder localPath(@Nullable String localPath) {
            this.localPath = Input.ofNullable(localPath);
            return this;
        }
        public SoftwareRecipeStepExecFileArgs build() {
            return new SoftwareRecipeStepExecFileArgs(allowedExitCodes, args, artifactId, localPath);
        }
    }
}
