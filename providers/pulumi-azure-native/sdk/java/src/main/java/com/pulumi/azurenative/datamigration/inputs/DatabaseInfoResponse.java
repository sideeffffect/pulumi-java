// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Project Database Details
 * 
 */
public final class DatabaseInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatabaseInfoResponse Empty = new DatabaseInfoResponse();

    /**
     * Name of the database
     * 
     */
    @Import(name="sourceDatabaseName", required=true)
    private String sourceDatabaseName;

    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    private DatabaseInfoResponse() {}

    private DatabaseInfoResponse(DatabaseInfoResponse $) {
        this.sourceDatabaseName = $.sourceDatabaseName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInfoResponse $;

        public Builder() {
            $ = new DatabaseInfoResponse();
        }

        public Builder(DatabaseInfoResponse defaults) {
            $ = new DatabaseInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder sourceDatabaseName(String sourceDatabaseName) {
            $.sourceDatabaseName = sourceDatabaseName;
            return this;
        }

        public DatabaseInfoResponse build() {
            $.sourceDatabaseName = Objects.requireNonNull($.sourceDatabaseName, "expected parameter 'sourceDatabaseName' to be non-null");
            return $;
        }
    }

}
