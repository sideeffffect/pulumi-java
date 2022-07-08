// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnapshotPlainArgs Empty = new GetSnapshotPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="snapshot", required=true)
    private String snapshot;

    public String snapshot() {
        return this.snapshot;
    }

    private GetSnapshotPlainArgs() {}

    private GetSnapshotPlainArgs(GetSnapshotPlainArgs $) {
        this.project = $.project;
        this.snapshot = $.snapshot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnapshotPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnapshotPlainArgs $;

        public Builder() {
            $ = new GetSnapshotPlainArgs();
        }

        public Builder(GetSnapshotPlainArgs defaults) {
            $ = new GetSnapshotPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder snapshot(String snapshot) {
            $.snapshot = snapshot;
            return this;
        }

        public GetSnapshotPlainArgs build() {
            $.snapshot = Objects.requireNonNull($.snapshot, "expected parameter 'snapshot' to be non-null");
            return $;
        }
    }

}
