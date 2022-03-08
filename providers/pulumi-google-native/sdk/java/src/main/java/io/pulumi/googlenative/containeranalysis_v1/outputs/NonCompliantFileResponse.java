// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NonCompliantFileResponse {
    /**
     * Command to display the non-compliant files.
     * 
     */
    private final String displayCommand;
    /**
     * display_command is a single command that can be used to display a list of non compliant files. When there is no such command, we can also iterate a list of non compliant file using 'path'. Empty if `display_command` is set.
     * 
     */
    private final String path;
    /**
     * Explains why a file is non compliant for a CIS check.
     * 
     */
    private final String reason;

    @OutputCustomType.Constructor({"displayCommand","path","reason"})
    private NonCompliantFileResponse(
        String displayCommand,
        String path,
        String reason) {
        this.displayCommand = displayCommand;
        this.path = path;
        this.reason = reason;
    }

    /**
     * Command to display the non-compliant files.
     * 
    */
    public String getDisplayCommand() {
        return this.displayCommand;
    }
    /**
     * display_command is a single command that can be used to display a list of non compliant files. When there is no such command, we can also iterate a list of non compliant file using 'path'. Empty if `display_command` is set.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * Explains why a file is non compliant for a CIS check.
     * 
    */
    public String getReason() {
        return this.reason;
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

        public Builder setDisplayCommand(String displayCommand) {
            this.displayCommand = Objects.requireNonNull(displayCommand);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public NonCompliantFileResponse build() {
            return new NonCompliantFileResponse(displayCommand, path, reason);
        }
    }
}
