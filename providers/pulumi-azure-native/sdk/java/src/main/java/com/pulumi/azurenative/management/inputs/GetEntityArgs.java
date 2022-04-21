// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.management.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEntityArgs Empty = new GetEntityArgs();

    /**
     * The filter parameter allows you to filter on the the name or display name fields. You can check for equality on the name field (e.g. name eq &#39;{entityName}&#39;)  and you can check for substrings on either the name or display name fields(e.g. contains(name, &#39;{substringToSearch}&#39;), contains(displayName, &#39;{substringToSearch&#39;)). Note that the &#39;{entityName}&#39; and &#39;{substringToSearch}&#39; fields are checked case insensitively.
     * 
     */
    @Import(name="filter")
    private @Nullable String filter;

    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * A filter which allows the get entities call to focus on a particular group (i.e. &#34;$filter=name eq &#39;groupName&#39;&#34;)
     * 
     */
    @Import(name="groupName")
    private @Nullable String groupName;

    public Optional<String> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    /**
     * The $search parameter is used in conjunction with the $filter parameter to return three different outputs depending on the parameter passed in.
     * With $search=AllowedParents the API will return the entity info of all groups that the requested entity will be able to reparent to as determined by the user&#39;s permissions.
     * With $search=AllowedChildren the API will return the entity info of all entities that can be added as children of the requested entity.
     * With $search=ParentAndFirstLevelChildren the API will return the parent and  first level of children that the user has either direct access to or indirect access via one of their descendants.
     * With $search=ParentOnly the API will return only the group if the user has access to at least one of the descendants of the group.
     * With $search=ChildrenOnly the API will return only the first level of children of the group entity info specified in $filter.  The user must have direct access to the children entities or one of it&#39;s descendants for it to show up in the results.
     * 
     */
    @Import(name="search")
    private @Nullable String search;

    public Optional<String> search() {
        return Optional.ofNullable(this.search);
    }

    /**
     * This parameter specifies the fields to include in the response. Can include any combination of Name,DisplayName,Type,ParentDisplayNameChain,ParentChain, e.g. &#39;$select=Name,DisplayName,Type,ParentDisplayNameChain,ParentNameChain&#39;. When specified the $select parameter can override select in $skipToken.
     * 
     */
    @Import(name="select")
    private @Nullable String select;

    public Optional<String> select() {
        return Optional.ofNullable(this.select);
    }

    /**
     * Number of entities to skip over when retrieving results. Passing this in will override $skipToken.
     * 
     */
    @Import(name="skip")
    private @Nullable Integer skip;

    public Optional<Integer> skip() {
        return Optional.ofNullable(this.skip);
    }

    /**
     * Page continuation token is only used if a previous operation returned a partial result.
     * If a previous response contains a nextLink element, the value of the nextLink element will include a token parameter that specifies a starting point to use for subsequent calls.
     * 
     */
    @Import(name="skiptoken")
    private @Nullable String skiptoken;

    public Optional<String> skiptoken() {
        return Optional.ofNullable(this.skiptoken);
    }

    /**
     * Number of elements to return when retrieving results. Passing this in will override $skipToken.
     * 
     */
    @Import(name="top")
    private @Nullable Integer top;

    public Optional<Integer> top() {
        return Optional.ofNullable(this.top);
    }

    /**
     * The view parameter allows clients to filter the type of data that is returned by the getEntities call.
     * 
     */
    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    private GetEntityArgs() {}

    private GetEntityArgs(GetEntityArgs $) {
        this.filter = $.filter;
        this.groupName = $.groupName;
        this.search = $.search;
        this.select = $.select;
        this.skip = $.skip;
        this.skiptoken = $.skiptoken;
        this.top = $.top;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEntityArgs $;

        public Builder() {
            $ = new GetEntityArgs();
        }

        public Builder(GetEntityArgs defaults) {
            $ = new GetEntityArgs(Objects.requireNonNull(defaults));
        }

        public Builder filter(@Nullable String filter) {
            $.filter = filter;
            return this;
        }

        public Builder groupName(@Nullable String groupName) {
            $.groupName = groupName;
            return this;
        }

        public Builder search(@Nullable String search) {
            $.search = search;
            return this;
        }

        public Builder select(@Nullable String select) {
            $.select = select;
            return this;
        }

        public Builder skip(@Nullable Integer skip) {
            $.skip = skip;
            return this;
        }

        public Builder skiptoken(@Nullable String skiptoken) {
            $.skiptoken = skiptoken;
            return this;
        }

        public Builder top(@Nullable Integer top) {
            $.top = top;
            return this;
        }

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public GetEntityArgs build() {
            return $;
        }
    }

}
