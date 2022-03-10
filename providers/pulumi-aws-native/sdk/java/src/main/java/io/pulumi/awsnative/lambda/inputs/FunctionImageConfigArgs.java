// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionImageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionImageConfigArgs Empty = new FunctionImageConfigArgs();

    /**
     * Command.
     * 
     */
    @InputImport(name="command")
      private final @Nullable Input<List<String>> command;

    public Input<List<String>> getCommand() {
        return this.command == null ? Input.empty() : this.command;
    }

    /**
     * EntryPoint.
     * 
     */
    @InputImport(name="entryPoint")
      private final @Nullable Input<List<String>> entryPoint;

    public Input<List<String>> getEntryPoint() {
        return this.entryPoint == null ? Input.empty() : this.entryPoint;
    }

    /**
     * WorkingDirectory.
     * 
     */
    @InputImport(name="workingDirectory")
      private final @Nullable Input<String> workingDirectory;

    public Input<String> getWorkingDirectory() {
        return this.workingDirectory == null ? Input.empty() : this.workingDirectory;
    }

    public FunctionImageConfigArgs(
        @Nullable Input<List<String>> command,
        @Nullable Input<List<String>> entryPoint,
        @Nullable Input<String> workingDirectory) {
        this.command = command;
        this.entryPoint = entryPoint;
        this.workingDirectory = workingDirectory;
    }

    private FunctionImageConfigArgs() {
        this.command = Input.empty();
        this.entryPoint = Input.empty();
        this.workingDirectory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> command;
        private @Nullable Input<List<String>> entryPoint;
        private @Nullable Input<String> workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionImageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.entryPoint = defaults.entryPoint;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder command(@Nullable Input<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = Input.ofNullable(command);
            return this;
        }

        public Builder entryPoint(@Nullable Input<List<String>> entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }

        public Builder entryPoint(@Nullable List<String> entryPoint) {
            this.entryPoint = Input.ofNullable(entryPoint);
            return this;
        }

        public Builder workingDirectory(@Nullable Input<String> workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }

        public Builder workingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = Input.ofNullable(workingDirectory);
            return this;
        }
        public FunctionImageConfigArgs build() {
            return new FunctionImageConfigArgs(command, entryPoint, workingDirectory);
        }
    }
}
