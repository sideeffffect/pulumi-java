// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntryGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEntryGroupArgs Empty = new GetEntryGroupArgs();

    @Import(name="entryGroupId", required=true)
    private String entryGroupId;

    public String entryGroupId() {
        return this.entryGroupId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="readMask")
    private @Nullable String readMask;

    public Optional<String> readMask() {
        return Optional.ofNullable(this.readMask);
    }

    private GetEntryGroupArgs() {}

    private GetEntryGroupArgs(GetEntryGroupArgs $) {
        this.entryGroupId = $.entryGroupId;
        this.location = $.location;
        this.project = $.project;
        this.readMask = $.readMask;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEntryGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEntryGroupArgs $;

        public Builder() {
            $ = new GetEntryGroupArgs();
        }

        public Builder(GetEntryGroupArgs defaults) {
            $ = new GetEntryGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder entryGroupId(String entryGroupId) {
            $.entryGroupId = entryGroupId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder readMask(@Nullable String readMask) {
            $.readMask = readMask;
            return this;
        }

        public GetEntryGroupArgs build() {
            $.entryGroupId = Objects.requireNonNull($.entryGroupId, "expected parameter 'entryGroupId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
