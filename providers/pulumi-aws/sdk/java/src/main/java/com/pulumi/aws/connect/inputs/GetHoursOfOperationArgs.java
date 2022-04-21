// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHoursOfOperationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHoursOfOperationArgs Empty = new GetHoursOfOperationArgs();

    /**
     * Returns information on a specific Hours of Operation by hours of operation id
     * 
     */
    @Import(name="hoursOfOperationId")
    private @Nullable String hoursOfOperationId;

    public Optional<String> hoursOfOperationId() {
        return Optional.ofNullable(this.hoursOfOperationId);
    }

    /**
     * Reference to the hosting Amazon Connect Instance
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Returns information on a specific Hours of Operation by name
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A the map of tags to assign to the Hours of Operation.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetHoursOfOperationArgs() {}

    private GetHoursOfOperationArgs(GetHoursOfOperationArgs $) {
        this.hoursOfOperationId = $.hoursOfOperationId;
        this.instanceId = $.instanceId;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHoursOfOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHoursOfOperationArgs $;

        public Builder() {
            $ = new GetHoursOfOperationArgs();
        }

        public Builder(GetHoursOfOperationArgs defaults) {
            $ = new GetHoursOfOperationArgs(Objects.requireNonNull(defaults));
        }

        public Builder hoursOfOperationId(@Nullable String hoursOfOperationId) {
            $.hoursOfOperationId = hoursOfOperationId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetHoursOfOperationArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
