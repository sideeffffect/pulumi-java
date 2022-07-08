// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMigrationJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMigrationJobArgs Empty = new GetMigrationJobArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="migrationJobId", required=true)
    private Output<String> migrationJobId;

    public Output<String> migrationJobId() {
        return this.migrationJobId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetMigrationJobArgs() {}

    private GetMigrationJobArgs(GetMigrationJobArgs $) {
        this.location = $.location;
        this.migrationJobId = $.migrationJobId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMigrationJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMigrationJobArgs $;

        public Builder() {
            $ = new GetMigrationJobArgs();
        }

        public Builder(GetMigrationJobArgs defaults) {
            $ = new GetMigrationJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder migrationJobId(Output<String> migrationJobId) {
            $.migrationJobId = migrationJobId;
            return this;
        }

        public Builder migrationJobId(String migrationJobId) {
            return migrationJobId(Output.of(migrationJobId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetMigrationJobArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.migrationJobId = Objects.requireNonNull($.migrationJobId, "expected parameter 'migrationJobId' to be non-null");
            return $;
        }
    }

}
