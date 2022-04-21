// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The data source precedence is a way to know the precedence of each data source.
 * 
 */
public final class DataSourcePrecedenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataSourcePrecedenceResponse Empty = new DataSourcePrecedenceResponse();

    /**
     * The data source reference id.
     * 
     */
    @Import(name="dataSourceReferenceId", required=true)
    private String dataSourceReferenceId;

    public String dataSourceReferenceId() {
        return this.dataSourceReferenceId;
    }

    /**
     * The data source type.
     * 
     */
    @Import(name="dataSourceType", required=true)
    private String dataSourceType;

    public String dataSourceType() {
        return this.dataSourceType;
    }

    /**
     * The data source ID.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    public Integer id() {
        return this.id;
    }

    /**
     * The data source name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * the precedence value.
     * 
     */
    @Import(name="precedence")
    private @Nullable Integer precedence;

    public Optional<Integer> precedence() {
        return Optional.ofNullable(this.precedence);
    }

    /**
     * The data source status.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    public String status() {
        return this.status;
    }

    private DataSourcePrecedenceResponse() {}

    private DataSourcePrecedenceResponse(DataSourcePrecedenceResponse $) {
        this.dataSourceReferenceId = $.dataSourceReferenceId;
        this.dataSourceType = $.dataSourceType;
        this.id = $.id;
        this.name = $.name;
        this.precedence = $.precedence;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourcePrecedenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourcePrecedenceResponse $;

        public Builder() {
            $ = new DataSourcePrecedenceResponse();
        }

        public Builder(DataSourcePrecedenceResponse defaults) {
            $ = new DataSourcePrecedenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder dataSourceReferenceId(String dataSourceReferenceId) {
            $.dataSourceReferenceId = dataSourceReferenceId;
            return this;
        }

        public Builder dataSourceType(String dataSourceType) {
            $.dataSourceType = dataSourceType;
            return this;
        }

        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder precedence(@Nullable Integer precedence) {
            $.precedence = precedence;
            return this;
        }

        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public DataSourcePrecedenceResponse build() {
            $.dataSourceReferenceId = Objects.requireNonNull($.dataSourceReferenceId, "expected parameter 'dataSourceReferenceId' to be non-null");
            $.dataSourceType = Objects.requireNonNull($.dataSourceType, "expected parameter 'dataSourceType' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
