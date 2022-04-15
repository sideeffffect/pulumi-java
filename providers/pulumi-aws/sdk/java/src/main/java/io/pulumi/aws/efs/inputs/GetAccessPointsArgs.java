// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPointsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccessPointsArgs Empty = new GetAccessPointsArgs();

    /**
     * EFS File System identifier.
     * 
     */
    @Import(name="fileSystemId", required=true)
      private final String fileSystemId;

    public String fileSystemId() {
        return this.fileSystemId;
    }

    public GetAccessPointsArgs(String fileSystemId) {
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
    }

    private GetAccessPointsArgs() {
        this.fileSystemId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fileSystemId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemId = defaults.fileSystemId;
        }

        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }        public GetAccessPointsArgs build() {
            return new GetAccessPointsArgs(fileSystemId);
        }
    }
}
