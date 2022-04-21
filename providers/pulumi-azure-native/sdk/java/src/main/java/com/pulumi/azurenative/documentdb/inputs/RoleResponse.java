// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The set of roles permitted through this Role Definition.
 * 
 */
public final class RoleResponse extends com.pulumi.resources.InvokeArgs {

    public static final RoleResponse Empty = new RoleResponse();

    /**
     * The database name the role is applied.
     * 
     */
    @Import(name="db")
    private @Nullable String db;

    public Optional<String> db() {
        return Optional.ofNullable(this.db);
    }

    /**
     * The role name.
     * 
     */
    @Import(name="role")
    private @Nullable String role;

    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    private RoleResponse() {}

    private RoleResponse(RoleResponse $) {
        this.db = $.db;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleResponse $;

        public Builder() {
            $ = new RoleResponse();
        }

        public Builder(RoleResponse defaults) {
            $ = new RoleResponse(Objects.requireNonNull(defaults));
        }

        public Builder db(@Nullable String db) {
            $.db = db;
            return this;
        }

        public Builder role(@Nullable String role) {
            $.role = role;
            return this;
        }

        public RoleResponse build() {
            return $;
        }
    }

}
