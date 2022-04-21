// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Active Directory configuration, relevant only for Cloud SQL for SQL Server.
 * 
 */
public final class SqlActiveDirectoryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlActiveDirectoryConfigArgs Empty = new SqlActiveDirectoryConfigArgs();

    /**
     * The name of the domain (e.g., mydomain.com).
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * This is always sql#activeDirectoryConfig.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private SqlActiveDirectoryConfigArgs() {}

    private SqlActiveDirectoryConfigArgs(SqlActiveDirectoryConfigArgs $) {
        this.domain = $.domain;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlActiveDirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlActiveDirectoryConfigArgs $;

        public Builder() {
            $ = new SqlActiveDirectoryConfigArgs();
        }

        public Builder(SqlActiveDirectoryConfigArgs defaults) {
            $ = new SqlActiveDirectoryConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public SqlActiveDirectoryConfigArgs build() {
            return $;
        }
    }

}
