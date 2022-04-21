// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetObjectAccessControlArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetObjectAccessControlArgs Empty = new GetObjectAccessControlArgs();

    @Import(name="bucket", required=true)
    private String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="entity", required=true)
    private String entity;

    public String entity() {
        return this.entity;
    }

    @Import(name="generation")
    private @Nullable String generation;

    public Optional<String> generation() {
        return Optional.ofNullable(this.generation);
    }

    @Import(name="object", required=true)
    private String object;

    public String object() {
        return this.object;
    }

    @Import(name="provisionalUserProject")
    private @Nullable String provisionalUserProject;

    public Optional<String> provisionalUserProject() {
        return Optional.ofNullable(this.provisionalUserProject);
    }

    @Import(name="userProject")
    private @Nullable String userProject;

    public Optional<String> userProject() {
        return Optional.ofNullable(this.userProject);
    }

    private GetObjectAccessControlArgs() {}

    private GetObjectAccessControlArgs(GetObjectAccessControlArgs $) {
        this.bucket = $.bucket;
        this.entity = $.entity;
        this.generation = $.generation;
        this.object = $.object;
        this.provisionalUserProject = $.provisionalUserProject;
        this.userProject = $.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetObjectAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetObjectAccessControlArgs $;

        public Builder() {
            $ = new GetObjectAccessControlArgs();
        }

        public Builder(GetObjectAccessControlArgs defaults) {
            $ = new GetObjectAccessControlArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder entity(String entity) {
            $.entity = entity;
            return this;
        }

        public Builder generation(@Nullable String generation) {
            $.generation = generation;
            return this;
        }

        public Builder object(String object) {
            $.object = object;
            return this;
        }

        public Builder provisionalUserProject(@Nullable String provisionalUserProject) {
            $.provisionalUserProject = provisionalUserProject;
            return this;
        }

        public Builder userProject(@Nullable String userProject) {
            $.userProject = userProject;
            return this;
        }

        public GetObjectAccessControlArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.entity = Objects.requireNonNull($.entity, "expected parameter 'entity' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
