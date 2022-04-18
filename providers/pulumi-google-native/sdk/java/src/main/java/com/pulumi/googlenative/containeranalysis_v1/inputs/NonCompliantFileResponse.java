// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Details about files that caused a compliance check to fail.
 * 
 */
public final class NonCompliantFileResponse extends com.pulumi.resources.InvokeArgs {

    public static final NonCompliantFileResponse Empty = new NonCompliantFileResponse();

    /**
     * Command to display the non-compliant files.
     * 
     */
    @Import(name="displayCommand", required=true)
      private final String displayCommand;

    public String displayCommand() {
        return this.displayCommand;
    }

    /**
     * display_command is a single command that can be used to display a list of non compliant files. When there is no such command, we can also iterate a list of non compliant file using 'path'. Empty if `display_command` is set.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String path() {
        return this.path;
    }

    /**
     * Explains why a file is non compliant for a CIS check.
     * 
     */
    @Import(name="reason", required=true)
      private final String reason;

    public String reason() {
        return this.reason;
    }

    public NonCompliantFileResponse(
        String displayCommand,
        String path,
        String reason) {
        this.displayCommand = Objects.requireNonNull(displayCommand, "expected parameter 'displayCommand' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.reason = Objects.requireNonNull(reason, "expected parameter 'reason' to be non-null");
    }

    private NonCompliantFileResponse() {
        this.displayCommand = null;
        this.path = null;
        this.reason = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonCompliantFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayCommand;
        private String path;
        private String reason;

        public Builder() {
    	      // Empty
        }

        public Builder(NonCompliantFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayCommand = defaults.displayCommand;
    	      this.path = defaults.path;
    	      this.reason = defaults.reason;
        }

        public Builder displayCommand(String displayCommand) {
            this.displayCommand = Objects.requireNonNull(displayCommand);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }        public NonCompliantFileResponse build() {
            return new NonCompliantFileResponse(displayCommand, path, reason);
        }
    }
}
