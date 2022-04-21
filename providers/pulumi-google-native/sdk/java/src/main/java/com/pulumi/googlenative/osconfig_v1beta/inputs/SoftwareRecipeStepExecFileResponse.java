// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Executes an artifact or local file.
 * 
 */
public final class SoftwareRecipeStepExecFileResponse extends com.pulumi.resources.InvokeArgs {

    public static final SoftwareRecipeStepExecFileResponse Empty = new SoftwareRecipeStepExecFileResponse();

    /**
     * Defaults to [0]. A list of possible return values that the program can return to indicate a success.
     * 
     */
    @Import(name="allowedExitCodes", required=true)
    private List<Integer> allowedExitCodes;

    public List<Integer> allowedExitCodes() {
        return this.allowedExitCodes;
    }

    /**
     * Arguments to be passed to the provided executable.
     * 
     */
    @Import(name="args", required=true)
    private List<String> args;

    public List<String> args() {
        return this.args;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @Import(name="artifactId", required=true)
    private String artifactId;

    public String artifactId() {
        return this.artifactId;
    }

    /**
     * The absolute path of the file on the local filesystem.
     * 
     */
    @Import(name="localPath", required=true)
    private String localPath;

    public String localPath() {
        return this.localPath;
    }

    private SoftwareRecipeStepExecFileResponse() {}

    private SoftwareRecipeStepExecFileResponse(SoftwareRecipeStepExecFileResponse $) {
        this.allowedExitCodes = $.allowedExitCodes;
        this.args = $.args;
        this.artifactId = $.artifactId;
        this.localPath = $.localPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareRecipeStepExecFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareRecipeStepExecFileResponse $;

        public Builder() {
            $ = new SoftwareRecipeStepExecFileResponse();
        }

        public Builder(SoftwareRecipeStepExecFileResponse defaults) {
            $ = new SoftwareRecipeStepExecFileResponse(Objects.requireNonNull(defaults));
        }

        public Builder allowedExitCodes(List<Integer> allowedExitCodes) {
            $.allowedExitCodes = allowedExitCodes;
            return this;
        }

        public Builder allowedExitCodes(Integer... allowedExitCodes) {
            return allowedExitCodes(List.of(allowedExitCodes));
        }

        public Builder args(List<String> args) {
            $.args = args;
            return this;
        }

        public Builder args(String... args) {
            return args(List.of(args));
        }

        public Builder artifactId(String artifactId) {
            $.artifactId = artifactId;
            return this;
        }

        public Builder localPath(String localPath) {
            $.localPath = localPath;
            return this;
        }

        public SoftwareRecipeStepExecFileResponse build() {
            $.allowedExitCodes = Objects.requireNonNull($.allowedExitCodes, "expected parameter 'allowedExitCodes' to be non-null");
            $.args = Objects.requireNonNull($.args, "expected parameter 'args' to be non-null");
            $.artifactId = Objects.requireNonNull($.artifactId, "expected parameter 'artifactId' to be non-null");
            $.localPath = Objects.requireNonNull($.localPath, "expected parameter 'localPath' to be non-null");
            return $;
        }
    }

}
