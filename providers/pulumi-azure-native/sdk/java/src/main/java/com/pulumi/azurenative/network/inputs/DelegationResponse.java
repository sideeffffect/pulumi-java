// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details the service to which the subnet is delegated.
 * 
 */
public final class DelegationResponse extends com.pulumi.resources.InvokeArgs {

    public static final DelegationResponse Empty = new DelegationResponse();

    /**
     * The actions permitted to the service upon delegation.
     * 
     */
    @Import(name="actions", required=true)
    private List<String> actions;

    public List<String> actions() {
        return this.actions;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a subnet. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the service delegation resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The name of the service to whom the subnet should be delegated (e.g. Microsoft.Sql/servers).
     * 
     */
    @Import(name="serviceName")
    private @Nullable String serviceName;

    public Optional<String> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private DelegationResponse() {}

    private DelegationResponse(DelegationResponse $) {
        this.actions = $.actions;
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.serviceName = $.serviceName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DelegationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DelegationResponse $;

        public Builder() {
            $ = new DelegationResponse();
        }

        public Builder(DelegationResponse defaults) {
            $ = new DelegationResponse(Objects.requireNonNull(defaults));
        }

        public Builder actions(List<String> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder serviceName(@Nullable String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public DelegationResponse build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
