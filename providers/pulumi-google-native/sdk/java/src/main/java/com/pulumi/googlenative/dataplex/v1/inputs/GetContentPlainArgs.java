// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContentPlainArgs Empty = new GetContentPlainArgs();

    @Import(name="contentId", required=true)
    private String contentId;

    public String contentId() {
        return this.contentId;
    }

    @Import(name="lakeId", required=true)
    private String lakeId;

    public String lakeId() {
        return this.lakeId;
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

    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    private GetContentPlainArgs() {}

    private GetContentPlainArgs(GetContentPlainArgs $) {
        this.contentId = $.contentId;
        this.lakeId = $.lakeId;
        this.location = $.location;
        this.project = $.project;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContentPlainArgs $;

        public Builder() {
            $ = new GetContentPlainArgs();
        }

        public Builder(GetContentPlainArgs defaults) {
            $ = new GetContentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder contentId(String contentId) {
            $.contentId = contentId;
            return this;
        }

        public Builder lakeId(String lakeId) {
            $.lakeId = lakeId;
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

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public GetContentPlainArgs build() {
            $.contentId = Objects.requireNonNull($.contentId, "expected parameter 'contentId' to be non-null");
            $.lakeId = Objects.requireNonNull($.lakeId, "expected parameter 'lakeId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
