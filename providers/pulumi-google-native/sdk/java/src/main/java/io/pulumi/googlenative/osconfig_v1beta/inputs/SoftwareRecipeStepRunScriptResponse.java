// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Runs a script through an interpreter.
 * 
 */
public final class SoftwareRecipeStepRunScriptResponse extends io.pulumi.resources.InvokeArgs {

    public static final SoftwareRecipeStepRunScriptResponse Empty = new SoftwareRecipeStepRunScriptResponse();

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    @InputImport(name="allowedExitCodes", required=true)
      private final List<Integer> allowedExitCodes;

    public List<Integer> getAllowedExitCodes() {
        return this.allowedExitCodes;
    }

    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script is executed directly, which likely only succeed for scripts with [shebang lines](<https://en.wikipedia.org/wiki/Shebang_\(Unix\)>).
     * 
     */
    @InputImport(name="interpreter", required=true)
      private final String interpreter;

    public String getInterpreter() {
        return this.interpreter;
    }

    /**
     * The shell script to be executed.
     * 
     */
    @InputImport(name="script", required=true)
      private final String script;

    public String getScript() {
        return this.script;
    }

    public SoftwareRecipeStepRunScriptResponse(
        List<Integer> allowedExitCodes,
        String interpreter,
        String script) {
        this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes, "expected parameter 'allowedExitCodes' to be non-null");
        this.interpreter = Objects.requireNonNull(interpreter, "expected parameter 'interpreter' to be non-null");
        this.script = Objects.requireNonNull(script, "expected parameter 'script' to be non-null");
    }

    private SoftwareRecipeStepRunScriptResponse() {
        this.allowedExitCodes = List.of();
        this.interpreter = null;
        this.script = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepRunScriptResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> allowedExitCodes;
        private String interpreter;
        private String script;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepRunScriptResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.interpreter = defaults.interpreter;
    	      this.script = defaults.script;
        }

        public Builder allowedExitCodes(List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes);
            return this;
        }

        public Builder interpreter(String interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }

        public Builder script(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }
        public SoftwareRecipeStepRunScriptResponse build() {
            return new SoftwareRecipeStepRunScriptResponse(allowedExitCodes, interpreter, script);
        }
    }
}
