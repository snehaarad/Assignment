import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ItempageComponent } from './itempage/itempage.component';

const routes: Routes = [
  
{path:"itempage",component:ItempageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
