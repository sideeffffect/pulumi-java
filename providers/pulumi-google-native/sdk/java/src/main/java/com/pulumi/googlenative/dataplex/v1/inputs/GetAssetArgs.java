// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAssetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssetArgs Empty = new GetAssetArgs();

    @Import(name="assetId", required=true)
    private Output<String> assetId;

    public Output<String> assetId() {
        return this.assetId;
    }

    @Import(name="lakeId", required=true)
    private Output<String> lakeId;

    public Output<String> lakeId() {
        return this.lakeId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
    private Output<String> zone;

    public Output<String> zone() {
        return this.zone;
    }

    private GetAssetArgs() {}

    private GetAssetArgs(GetAssetArgs $) {
        this.assetId = $.assetId;
        this.lakeId = $.lakeId;
        this.location = $.location;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssetArgs $;

        public Builder() {
            $ = new GetAssetArgs();
        }

        public Builder(GetAssetArgs defaults) {
            $ = new GetAssetArgs(Objects.requireNonNull(defaults));
        }

        public Builder assetId(Output<String> assetId) {
            $.assetId = assetId;
            return this;
        }

        public Builder assetId(String assetId) {
            return assetId(Output.of(assetId));
        }

        public Builder lakeId(Output<String> lakeId) {
            $.lakeId = lakeId;
            return this;
        }

        public Builder lakeId(String lakeId) {
            return lakeId(Output.of(lakeId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetAssetArgs build() {
            $.assetId = Objects.requireNonNull($.assetId, "expected parameter 'assetId' to be non-null");
            $.lakeId = Objects.requireNonNull($.lakeId, "expected parameter 'lakeId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
