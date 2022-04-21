// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Database flags for Cloud SQL instances.
 * 
 */
public final class DatabaseFlagsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatabaseFlagsResponse Empty = new DatabaseFlagsResponse();

    /**
     * The name of the flag. These flags are passed at instance startup, so include both server options and system variables. Flags are specified with underscores, not hyphens. For more information, see [Configuring Database Flags](https://cloud.google.com/sql/docs/mysql/flags) in the Cloud SQL documentation.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The value of the flag. Boolean flags are set to `on` for true and `off` for false. This field must be omitted if the flag doesn&#39;t take a value.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private DatabaseFlagsResponse() {}

    private DatabaseFlagsResponse(DatabaseFlagsResponse $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseFlagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseFlagsResponse $;

        public Builder() {
            $ = new DatabaseFlagsResponse();
        }

        public Builder(DatabaseFlagsResponse defaults) {
            $ = new DatabaseFlagsResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public DatabaseFlagsResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
