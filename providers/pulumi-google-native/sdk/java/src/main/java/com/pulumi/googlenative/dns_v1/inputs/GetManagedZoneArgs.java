// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagedZoneArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedZoneArgs Empty = new GetManagedZoneArgs();

    @Import(name="clientOperationId")
    private @Nullable String clientOperationId;

    public Optional<String> clientOperationId() {
        return Optional.ofNullable(this.clientOperationId);
    }

    @Import(name="managedZone", required=true)
    private String managedZone;

    public String managedZone() {
        return this.managedZone;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetManagedZoneArgs() {}

    private GetManagedZoneArgs(GetManagedZoneArgs $) {
        this.clientOperationId = $.clientOperationId;
        this.managedZone = $.managedZone;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedZoneArgs $;

        public Builder() {
            $ = new GetManagedZoneArgs();
        }

        public Builder(GetManagedZoneArgs defaults) {
            $ = new GetManagedZoneArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientOperationId(@Nullable String clientOperationId) {
            $.clientOperationId = clientOperationId;
            return this;
        }

        public Builder managedZone(String managedZone) {
            $.managedZone = managedZone;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetManagedZoneArgs build() {
            $.managedZone = Objects.requireNonNull($.managedZone, "expected parameter 'managedZone' to be non-null");
            return $;
        }
    }

}
