// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseArgs Empty = new GetDatabaseArgs();

    @Import(name="database", required=true)
    private String database;

    public String database() {
        return this.database;
    }

    @Import(name="instance", required=true)
    private String instance;

    public String instance() {
        return this.instance;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDatabaseArgs() {}

    private GetDatabaseArgs(GetDatabaseArgs $) {
        this.database = $.database;
        this.instance = $.instance;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseArgs $;

        public Builder() {
            $ = new GetDatabaseArgs();
        }

        public Builder(GetDatabaseArgs defaults) {
            $ = new GetDatabaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(String database) {
            $.database = database;
            return this;
        }

        public Builder instance(String instance) {
            $.instance = instance;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDatabaseArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            return $;
        }
    }

}
