// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeUpdateStepScriptRunArgs extends ResourceArgs {

    public static final GuestPoliciesRecipeUpdateStepScriptRunArgs Empty = new GuestPoliciesRecipeUpdateStepScriptRunArgs();

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    @Import(name="allowedExitCodes")
    private @Nullable Output<List<Integer>> allowedExitCodes;

    /**
     * @return Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    public Optional<Output<List<Integer>>> allowedExitCodes() {
        return Optional.ofNullable(this.allowedExitCodes);
    }

    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script is executed directly,
     * which likely only succeed for scripts with shebang lines.
     * Possible values are `SHELL` and `POWERSHELL`.
     * 
     */
    @Import(name="interpreter")
    private @Nullable Output<String> interpreter;

    /**
     * @return The script interpreter to use to run the script. If no interpreter is specified the script is executed directly,
     * which likely only succeed for scripts with shebang lines.
     * Possible values are `SHELL` and `POWERSHELL`.
     * 
     */
    public Optional<Output<String>> interpreter() {
        return Optional.ofNullable(this.interpreter);
    }

    /**
     * The shell script to be executed.
     * 
     */
    @Import(name="script", required=true)
    private Output<String> script;

    /**
     * @return The shell script to be executed.
     * 
     */
    public Output<String> script() {
        return this.script;
    }

    private GuestPoliciesRecipeUpdateStepScriptRunArgs() {}

    private GuestPoliciesRecipeUpdateStepScriptRunArgs(GuestPoliciesRecipeUpdateStepScriptRunArgs $) {
        this.allowedExitCodes = $.allowedExitCodes;
        this.interpreter = $.interpreter;
        this.script = $.script;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPoliciesRecipeUpdateStepScriptRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPoliciesRecipeUpdateStepScriptRunArgs $;

        public Builder() {
            $ = new GuestPoliciesRecipeUpdateStepScriptRunArgs();
        }

        public Builder(GuestPoliciesRecipeUpdateStepScriptRunArgs defaults) {
            $ = new GuestPoliciesRecipeUpdateStepScriptRunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedExitCodes Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
         * 
         * @return builder
         * 
         */
        public Builder allowedExitCodes(@Nullable Output<List<Integer>> allowedExitCodes) {
            $.allowedExitCodes = allowedExitCodes;
            return this;
        }

        /**
         * @param allowedExitCodes Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
         * 
         * @return builder
         * 
         */
        public Builder allowedExitCodes(List<Integer> allowedExitCodes) {
            return allowedExitCodes(Output.of(allowedExitCodes));
        }

        /**
         * @param allowedExitCodes Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
         * 
         * @return builder
         * 
         */
        public Builder allowedExitCodes(Integer... allowedExitCodes) {
            return allowedExitCodes(List.of(allowedExitCodes));
        }

        /**
         * @param interpreter The script interpreter to use to run the script. If no interpreter is specified the script is executed directly,
         * which likely only succeed for scripts with shebang lines.
         * Possible values are `SHELL` and `POWERSHELL`.
         * 
         * @return builder
         * 
         */
        public Builder interpreter(@Nullable Output<String> interpreter) {
            $.interpreter = interpreter;
            return this;
        }

        /**
         * @param interpreter The script interpreter to use to run the script. If no interpreter is specified the script is executed directly,
         * which likely only succeed for scripts with shebang lines.
         * Possible values are `SHELL` and `POWERSHELL`.
         * 
         * @return builder
         * 
         */
        public Builder interpreter(String interpreter) {
            return interpreter(Output.of(interpreter));
        }

        /**
         * @param script The shell script to be executed.
         * 
         * @return builder
         * 
         */
        public Builder script(Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script The shell script to be executed.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        public GuestPoliciesRecipeUpdateStepScriptRunArgs build() {
            $.script = Objects.requireNonNull($.script, "expected parameter 'script' to be non-null");
            return $;
        }
    }

}
