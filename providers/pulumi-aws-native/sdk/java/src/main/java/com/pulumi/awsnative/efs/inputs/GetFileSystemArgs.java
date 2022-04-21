// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.efs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFileSystemArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFileSystemArgs Empty = new GetFileSystemArgs();

    @Import(name="fileSystemId", required=true)
    private String fileSystemId;

    public String fileSystemId() {
        return this.fileSystemId;
    }

    private GetFileSystemArgs() {}

    private GetFileSystemArgs(GetFileSystemArgs $) {
        this.fileSystemId = $.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFileSystemArgs $;

        public Builder() {
            $ = new GetFileSystemArgs();
        }

        public Builder(GetFileSystemArgs defaults) {
            $ = new GetFileSystemArgs(Objects.requireNonNull(defaults));
        }

        public Builder fileSystemId(String fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        public GetFileSystemArgs build() {
            $.fileSystemId = Objects.requireNonNull($.fileSystemId, "expected parameter 'fileSystemId' to be non-null");
            return $;
        }
    }

}
