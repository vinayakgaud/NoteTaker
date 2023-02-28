<form action="../../SaveNote" method ="post">
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label mt-3 mb-1">Title</label>
		<input required class="form-control" id="exampleFormControlInput1"
			placeholder="Enter the title for note here(50 characters)" name="title">
	</div>
	<div class="mb-3">
		<label for="exampleFormControlTextarea1" class="form-label mb-1">Content</label>
		<textarea required class="form-control"
			id="exampleFormControlTextarea1" rows="3"
			placeholder="Enter the content for note here(255 characters)" name="content"></textarea>
	</div>
	<div class="text-center">
		<input class="btn btn-primary mt-2" type="submit" value="Add Note">
	</div>
</form>