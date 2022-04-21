// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetAmiIdsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAmiIdsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAmiIdsArgs Empty = new GetAmiIdsArgs();

    /**
     * Limit search to users with *explicit* launch
     * permission on  the image. Valid items are the numeric account ID or `self`.
     * 
     */
    @Import(name="executableUsers")
    private @Nullable List<String> executableUsers;

    public Optional<List<String>> executableUsers() {
        return Optional.ofNullable(this.executableUsers);
    }

    /**
     * One or more name/value pairs to filter off of. There
     * are several valid keys, for a full reference, check out
     * [describe-images in the AWS CLI reference][1].
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetAmiIdsFilter> filters;

    public Optional<List<GetAmiIdsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A regex string to apply to the AMI list returned
     * by AWS. This allows more advanced filtering not supported from the AWS API.
     * This filtering is done locally on what AWS returns, and could have a performance
     * impact if the result is large. It is recommended to combine this with other
     * options to narrow down the list AWS returns.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g., `amazon`, `aws-marketplace`, `microsoft`).
     * 
     */
    @Import(name="owners", required=true)
    private List<String> owners;

    public List<String> owners() {
        return this.owners;
    }

    /**
     * Used to sort AMIs by creation time.
     * 
     */
    @Import(name="sortAscending")
    private @Nullable Boolean sortAscending;

    public Optional<Boolean> sortAscending() {
        return Optional.ofNullable(this.sortAscending);
    }

    private GetAmiIdsArgs() {}

    private GetAmiIdsArgs(GetAmiIdsArgs $) {
        this.executableUsers = $.executableUsers;
        this.filters = $.filters;
        this.nameRegex = $.nameRegex;
        this.owners = $.owners;
        this.sortAscending = $.sortAscending;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAmiIdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAmiIdsArgs $;

        public Builder() {
            $ = new GetAmiIdsArgs();
        }

        public Builder(GetAmiIdsArgs defaults) {
            $ = new GetAmiIdsArgs(Objects.requireNonNull(defaults));
        }

        public Builder executableUsers(@Nullable List<String> executableUsers) {
            $.executableUsers = executableUsers;
            return this;
        }

        public Builder executableUsers(String... executableUsers) {
            return executableUsers(List.of(executableUsers));
        }

        public Builder filters(@Nullable List<GetAmiIdsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetAmiIdsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder owners(List<String> owners) {
            $.owners = owners;
            return this;
        }

        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }

        public Builder sortAscending(@Nullable Boolean sortAscending) {
            $.sortAscending = sortAscending;
            return this;
        }

        public GetAmiIdsArgs build() {
            $.owners = Objects.requireNonNull($.owners, "expected parameter 'owners' to be non-null");
            return $;
        }
    }

}
