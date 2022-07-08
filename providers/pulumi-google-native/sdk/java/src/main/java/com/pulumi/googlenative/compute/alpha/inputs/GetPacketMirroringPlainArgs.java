// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPacketMirroringPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPacketMirroringPlainArgs Empty = new GetPacketMirroringPlainArgs();

    @Import(name="packetMirroring", required=true)
    private String packetMirroring;

    public String packetMirroring() {
        return this.packetMirroring;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    private GetPacketMirroringPlainArgs() {}

    private GetPacketMirroringPlainArgs(GetPacketMirroringPlainArgs $) {
        this.packetMirroring = $.packetMirroring;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPacketMirroringPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPacketMirroringPlainArgs $;

        public Builder() {
            $ = new GetPacketMirroringPlainArgs();
        }

        public Builder(GetPacketMirroringPlainArgs defaults) {
            $ = new GetPacketMirroringPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder packetMirroring(String packetMirroring) {
            $.packetMirroring = packetMirroring;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetPacketMirroringPlainArgs build() {
            $.packetMirroring = Objects.requireNonNull($.packetMirroring, "expected parameter 'packetMirroring' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
