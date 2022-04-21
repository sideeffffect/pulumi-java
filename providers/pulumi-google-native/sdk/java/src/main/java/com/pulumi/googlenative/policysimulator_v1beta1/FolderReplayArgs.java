// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.policysimulator_v1beta1.inputs.GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderReplayArgs extends com.pulumi.resources.ResourceArgs {

    public static final FolderReplayArgs Empty = new FolderReplayArgs();

    /**
     * The configuration used for the `Replay`.
     * 
     */
    @Import(name="config", required=true)
    private Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config;

    public Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config() {
        return this.config;
    }

    @Import(name="folderId", required=true)
    private Output<String> folderId;

    public Output<String> folderId() {
        return this.folderId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    private FolderReplayArgs() {}

    private FolderReplayArgs(FolderReplayArgs $) {
        this.config = $.config;
        this.folderId = $.folderId;
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderReplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderReplayArgs $;

        public Builder() {
            $ = new FolderReplayArgs();
        }

        public Builder(FolderReplayArgs defaults) {
            $ = new FolderReplayArgs(Objects.requireNonNull(defaults));
        }

        public Builder config(Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config) {
            $.config = config;
            return this;
        }

        public Builder config(GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs config) {
            return config(Output.of(config));
        }

        public Builder folderId(Output<String> folderId) {
            $.folderId = folderId;
            return this;
        }

        public Builder folderId(String folderId) {
            return folderId(Output.of(folderId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public FolderReplayArgs build() {
            $.config = Objects.requireNonNull($.config, "expected parameter 'config' to be non-null");
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            return $;
        }
    }

}
