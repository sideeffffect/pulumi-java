// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig.v1.enums.OSPolicyResourceExecResourceExecInterpreter;
import com.pulumi.googlenative.osconfig.v1.inputs.OSPolicyResourceFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A file or script to execute.
 * 
 */
public final class OSPolicyResourceExecResourceExecArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceExecResourceExecArgs Empty = new OSPolicyResourceExecResourceExecArgs();

    /**
     * Optional arguments to pass to the source during execution.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return Optional arguments to pass to the source during execution.
     * 
     */
    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * A remote or local file.
     * 
     */
    @Import(name="file")
    private @Nullable Output<OSPolicyResourceFileArgs> file;

    /**
     * @return A remote or local file.
     * 
     */
    public Optional<Output<OSPolicyResourceFileArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    /**
     * The script interpreter to use.
     * 
     */
    @Import(name="interpreter", required=true)
    private Output<OSPolicyResourceExecResourceExecInterpreter> interpreter;

    /**
     * @return The script interpreter to use.
     * 
     */
    public Output<OSPolicyResourceExecResourceExecInterpreter> interpreter() {
        return this.interpreter;
    }

    /**
     * Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
     * 
     */
    @Import(name="outputFilePath")
    private @Nullable Output<String> outputFilePath;

    /**
     * @return Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
     * 
     */
    public Optional<Output<String>> outputFilePath() {
        return Optional.ofNullable(this.outputFilePath);
    }

    /**
     * An inline script. The size of the script is limited to 1024 characters.
     * 
     */
    @Import(name="script")
    private @Nullable Output<String> script;

    /**
     * @return An inline script. The size of the script is limited to 1024 characters.
     * 
     */
    public Optional<Output<String>> script() {
        return Optional.ofNullable(this.script);
    }

    private OSPolicyResourceExecResourceExecArgs() {}

    private OSPolicyResourceExecResourceExecArgs(OSPolicyResourceExecResourceExecArgs $) {
        this.args = $.args;
        this.file = $.file;
        this.interpreter = $.interpreter;
        this.outputFilePath = $.outputFilePath;
        this.script = $.script;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceExecResourceExecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceExecResourceExecArgs $;

        public Builder() {
            $ = new OSPolicyResourceExecResourceExecArgs();
        }

        public Builder(OSPolicyResourceExecResourceExecArgs defaults) {
            $ = new OSPolicyResourceExecResourceExecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param args Optional arguments to pass to the source during execution.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Optional arguments to pass to the source during execution.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Optional arguments to pass to the source during execution.
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param file A remote or local file.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<OSPolicyResourceFileArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file A remote or local file.
         * 
         * @return builder
         * 
         */
        public Builder file(OSPolicyResourceFileArgs file) {
            return file(Output.of(file));
        }

        /**
         * @param interpreter The script interpreter to use.
         * 
         * @return builder
         * 
         */
        public Builder interpreter(Output<OSPolicyResourceExecResourceExecInterpreter> interpreter) {
            $.interpreter = interpreter;
            return this;
        }

        /**
         * @param interpreter The script interpreter to use.
         * 
         * @return builder
         * 
         */
        public Builder interpreter(OSPolicyResourceExecResourceExecInterpreter interpreter) {
            return interpreter(Output.of(interpreter));
        }

        /**
         * @param outputFilePath Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
         * 
         * @return builder
         * 
         */
        public Builder outputFilePath(@Nullable Output<String> outputFilePath) {
            $.outputFilePath = outputFilePath;
            return this;
        }

        /**
         * @param outputFilePath Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
         * 
         * @return builder
         * 
         */
        public Builder outputFilePath(String outputFilePath) {
            return outputFilePath(Output.of(outputFilePath));
        }

        /**
         * @param script An inline script. The size of the script is limited to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script An inline script. The size of the script is limited to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        public OSPolicyResourceExecResourceExecArgs build() {
            $.interpreter = Objects.requireNonNull($.interpreter, "expected parameter 'interpreter' to be non-null");
            return $;
        }
    }

}
