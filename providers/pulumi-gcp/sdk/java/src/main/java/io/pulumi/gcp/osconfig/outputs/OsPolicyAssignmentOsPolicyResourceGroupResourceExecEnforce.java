// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFile;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce {
    /**
     * Optional arguments to pass to the source during execution.
     * 
     */
    private final @Nullable List<String> args;
    /**
     * A remote or local source.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFile file;
    /**
     * Required. The script interpreter to use. Possible values: INTERPRETER_UNSPECIFIED, NONE, SHELL, POWERSHELL
     * 
     */
    private final String interpreter;
    /**
     * Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
     * 
     */
    private final @Nullable String outputFilePath;
    /**
     * An inline script. The size of the script is limited to 1024 characters.
     * 
     */
    private final @Nullable String script;

    @CustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce(
        @CustomType.Parameter("args") @Nullable List<String> args,
        @CustomType.Parameter("file") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFile file,
        @CustomType.Parameter("interpreter") String interpreter,
        @CustomType.Parameter("outputFilePath") @Nullable String outputFilePath,
        @CustomType.Parameter("script") @Nullable String script) {
        this.args = args;
        this.file = file;
        this.interpreter = interpreter;
        this.outputFilePath = outputFilePath;
        this.script = script;
    }

    /**
     * Optional arguments to pass to the source during execution.
     * 
    */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * A remote or local source.
     * 
    */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFile> file() {
        return Optional.ofNullable(this.file);
    }
    /**
     * Required. The script interpreter to use. Possible values: INTERPRETER_UNSPECIFIED, NONE, SHELL, POWERSHELL
     * 
    */
    public String interpreter() {
        return this.interpreter;
    }
    /**
     * Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
     * 
    */
    public Optional<String> outputFilePath() {
        return Optional.ofNullable(this.outputFilePath);
    }
    /**
     * An inline script. The size of the script is limited to 1024 characters.
     * 
    */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFile file;
        private String interpreter;
        private @Nullable String outputFilePath;
        private @Nullable String script;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.file = defaults.file;
    	      this.interpreter = defaults.interpreter;
    	      this.outputFilePath = defaults.outputFilePath;
    	      this.script = defaults.script;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder file(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFile file) {
            this.file = file;
            return this;
        }
        public Builder interpreter(String interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }
        public Builder outputFilePath(@Nullable String outputFilePath) {
            this.outputFilePath = outputFilePath;
            return this;
        }
        public Builder script(@Nullable String script) {
            this.script = script;
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforce(args, file, interpreter, outputFilePath, script);
        }
    }
}
