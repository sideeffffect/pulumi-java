// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies an executable to run on a fully configured node and a timeout period for executable completion.
 * 
 */
public final class NodeInitializationActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeInitializationActionArgs Empty = new NodeInitializationActionArgs();

    /**
     * Cloud Storage URI of executable file.
     * 
     */
    @Import(name="executableFile", required=true)
    private Output<String> executableFile;

    public Output<String> executableFile() {
        return this.executableFile;
    }

    /**
     * Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
     * 
     */
    @Import(name="executionTimeout")
    private @Nullable Output<String> executionTimeout;

    public Optional<Output<String>> executionTimeout() {
        return Optional.ofNullable(this.executionTimeout);
    }

    private NodeInitializationActionArgs() {}

    private NodeInitializationActionArgs(NodeInitializationActionArgs $) {
        this.executableFile = $.executableFile;
        this.executionTimeout = $.executionTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeInitializationActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeInitializationActionArgs $;

        public Builder() {
            $ = new NodeInitializationActionArgs();
        }

        public Builder(NodeInitializationActionArgs defaults) {
            $ = new NodeInitializationActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder executableFile(Output<String> executableFile) {
            $.executableFile = executableFile;
            return this;
        }

        public Builder executableFile(String executableFile) {
            return executableFile(Output.of(executableFile));
        }

        public Builder executionTimeout(@Nullable Output<String> executionTimeout) {
            $.executionTimeout = executionTimeout;
            return this;
        }

        public Builder executionTimeout(String executionTimeout) {
            return executionTimeout(Output.of(executionTimeout));
        }

        public NodeInitializationActionArgs build() {
            $.executableFile = Objects.requireNonNull($.executableFile, "expected parameter 'executableFile' to be non-null");
            return $;
        }
    }

}
