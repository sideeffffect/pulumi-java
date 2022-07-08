// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderReplayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFolderReplayArgs Empty = new GetFolderReplayArgs();

    @Import(name="folderId", required=true)
    private Output<String> folderId;

    public Output<String> folderId() {
        return this.folderId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="replayId", required=true)
    private Output<String> replayId;

    public Output<String> replayId() {
        return this.replayId;
    }

    private GetFolderReplayArgs() {}

    private GetFolderReplayArgs(GetFolderReplayArgs $) {
        this.folderId = $.folderId;
        this.location = $.location;
        this.replayId = $.replayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFolderReplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFolderReplayArgs $;

        public Builder() {
            $ = new GetFolderReplayArgs();
        }

        public Builder(GetFolderReplayArgs defaults) {
            $ = new GetFolderReplayArgs(Objects.requireNonNull(defaults));
        }

        public Builder folderId(Output<String> folderId) {
            $.folderId = folderId;
            return this;
        }

        public Builder folderId(String folderId) {
            return folderId(Output.of(folderId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder replayId(Output<String> replayId) {
            $.replayId = replayId;
            return this;
        }

        public Builder replayId(String replayId) {
            return replayId(Output.of(replayId));
        }

        public GetFolderReplayArgs build() {
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.replayId = Objects.requireNonNull($.replayId, "expected parameter 'replayId' to be non-null");
            return $;
        }
    }

}
