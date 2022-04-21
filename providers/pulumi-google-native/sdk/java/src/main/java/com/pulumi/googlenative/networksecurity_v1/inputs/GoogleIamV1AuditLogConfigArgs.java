// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networksecurity_v1.enums.GoogleIamV1AuditLogConfigLogType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Provides the configuration for logging a type of permissions. Example: { &#34;audit_log_configs&#34;: [ { &#34;log_type&#34;: &#34;DATA_READ&#34;, &#34;exempted_members&#34;: [ &#34;user:jose@example.com&#34; ] }, { &#34;log_type&#34;: &#34;DATA_WRITE&#34; } ] } This enables &#39;DATA_READ&#39; and &#39;DATA_WRITE&#39; logging, while exempting jose@example.com from DATA_READ logging.
 * 
 */
public final class GoogleIamV1AuditLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleIamV1AuditLogConfigArgs Empty = new GoogleIamV1AuditLogConfigArgs();

    /**
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * 
     */
    @Import(name="exemptedMembers")
    private @Nullable Output<List<String>> exemptedMembers;

    public Optional<Output<List<String>>> exemptedMembers() {
        return Optional.ofNullable(this.exemptedMembers);
    }

    /**
     * The log type that this config enables.
     * 
     */
    @Import(name="logType")
    private @Nullable Output<GoogleIamV1AuditLogConfigLogType> logType;

    public Optional<Output<GoogleIamV1AuditLogConfigLogType>> logType() {
        return Optional.ofNullable(this.logType);
    }

    private GoogleIamV1AuditLogConfigArgs() {}

    private GoogleIamV1AuditLogConfigArgs(GoogleIamV1AuditLogConfigArgs $) {
        this.exemptedMembers = $.exemptedMembers;
        this.logType = $.logType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleIamV1AuditLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleIamV1AuditLogConfigArgs $;

        public Builder() {
            $ = new GoogleIamV1AuditLogConfigArgs();
        }

        public Builder(GoogleIamV1AuditLogConfigArgs defaults) {
            $ = new GoogleIamV1AuditLogConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder exemptedMembers(@Nullable Output<List<String>> exemptedMembers) {
            $.exemptedMembers = exemptedMembers;
            return this;
        }

        public Builder exemptedMembers(List<String> exemptedMembers) {
            return exemptedMembers(Output.of(exemptedMembers));
        }

        public Builder exemptedMembers(String... exemptedMembers) {
            return exemptedMembers(List.of(exemptedMembers));
        }

        public Builder logType(@Nullable Output<GoogleIamV1AuditLogConfigLogType> logType) {
            $.logType = logType;
            return this;
        }

        public Builder logType(GoogleIamV1AuditLogConfigLogType logType) {
            return logType(Output.of(logType));
        }

        public GoogleIamV1AuditLogConfigArgs build() {
            return $;
        }
    }

}
